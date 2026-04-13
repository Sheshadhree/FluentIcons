package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhonePagination20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhonePagination20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
            moveToRelative(3f, 11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(8.276f, 14f, 8f, 14f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(7.724f, 15f, 8f, 15f)
            close()
            moveToRelative(2f, 0f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.276f, 14f, 10f, 14f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(9.724f, 15f, 10f, 15f)
            close()
            moveToRelative(2.5f, -0.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(11.724f, 15f, 12f, 15f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
