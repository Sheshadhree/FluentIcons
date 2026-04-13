package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PipelinePlay20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PipelinePlay20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.5f)
            curveTo(2f, 4.672f, 2.672f, 4f, 3.5f, 4f)
            reflectiveCurveTo(5f, 4.671f, 5f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(5f, 15.33f, 4.328f, 16f, 3.5f, 16f)
            reflectiveCurveTo(2f, 15.328f, 2f, 14.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(12f, 3.522f)
            curveTo(11.361f, 9.26f, 9.26f, 11.362f, 9.022f, 14f)
            horizontalLineTo(6f)
            verticalLineTo(6f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(3.022f)
            close()
            moveTo(15f, 5.5f)
            verticalLineToRelative(3.522f)
            curveToRelative(1.134f, 0.103f, 2.17f, 0.55f, 3f, 1.235f)
            verticalLineTo(5.5f)
            curveTo(18f, 4.672f, 17.328f, 4f, 16.5f, 4f)
            reflectiveCurveTo(15f, 4.672f, 15f, 5.5f)
            close()
            moveToRelative(4f, 9f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-2.287f, -0.437f)
            lineToRelative(-2.97f, -1.65f)
            curveTo(13.41f, 12.227f, 13f, 12.469f, 13f, 12.85f)
            verticalLineToRelative(3.3f)
            curveToRelative(0f, 0.382f, 0.41f, 0.623f, 0.743f, 0.437f)
            lineToRelative(2.97f, -1.65f)
            curveToRelative(0.343f, -0.19f, 0.343f, -0.684f, 0f, -0.874f)
            close()
        }
    }.build()
}
