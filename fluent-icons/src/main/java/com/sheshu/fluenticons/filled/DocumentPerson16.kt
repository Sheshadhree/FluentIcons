package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentPerson16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentPerson16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            verticalLineToRelative(3.5f)
            curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
            horizontalLineTo(13f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(7.81f)
            lineToRelative(0.018f, -0.015f)
            curveTo(8.632f, 14.315f, 9f, 13.402f, 9f, 12.5f)
            curveToRelative(0f, -1.304f, -0.999f, -2.375f, -2.273f, -2.49f)
            curveTo(7.207f, 9.478f, 7.5f, 8.773f, 7.5f, 8f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            curveTo(3.954f, 5f, 3.441f, 5.146f, 3f, 5.401f)
            verticalLineTo(2.5f)
            curveTo(3f, 1.672f, 3.672f, 1f, 4.5f, 1f)
            horizontalLineTo(8f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(4.5f)
            curveTo(9f, 4.776f, 9.224f, 5f, 9.5f, 5f)
            horizontalLineToRelative(3.25f)
            lineTo(9f, 1.25f)
            close()
            moveTo(6.5f, 8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveTo(8f, 12.5f)
            curveTo(8f, 13.745f, 7f, 15f, 4.5f, 15f)
            reflectiveCurveTo(1f, 13.75f, 1f, 12.5f)
            curveTo(1f, 11.672f, 1.672f, 11f, 2.5f, 11f)
            horizontalLineToRelative(4f)
            curveTo(7.328f, 11f, 8f, 11.672f, 8f, 12.5f)
            close()
        }
    }.build()
}
