package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.03f, 5.507f)
            curveTo(4.273f, 3.531f, 5.958f, 2f, 8f, 2f)
            curveToRelative(1.93f, 0f, 3.54f, 1.366f, 3.917f, 3.184f)
            curveTo(11.465f, 5.064f, 10.99f, 5f, 10.5f, 5f)
            curveTo(7.462f, 5f, 5f, 7.462f, 5f, 10.5f)
            curveToRelative(0f, 0.52f, 0.072f, 1.023f, 0.207f, 1.5f)
            horizontalLineTo(4.25f)
            curveTo(2.455f, 12f, 1f, 10.545f, 1f, 8.75f)
            curveToRelative(0f, -1.721f, 1.338f, -3.13f, 3.03f, -3.243f)
            close()
            moveTo(15f, 10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
            moveToRelative(-4f, -2f)
            curveTo(11f, 8.224f, 10.776f, 8f, 10.5f, 8f)
            reflectiveCurveTo(10f, 8.224f, 10f, 8.5f)
            verticalLineTo(10f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 10f, 8f, 10.224f, 8f, 10.5f)
            reflectiveCurveTo(8.224f, 11f, 8.5f, 11f)
            horizontalLineTo(10f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 10f, 12.5f, 10f)
            horizontalLineTo(11f)
            verticalLineTo(8.5f)
            close()
        }
    }.build()
}
