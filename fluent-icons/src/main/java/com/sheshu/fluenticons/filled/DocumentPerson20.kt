package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentPerson20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentPerson20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            verticalLineToRelative(4.5f)
            curveTo(10f, 7.328f, 10.672f, 8f, 11.5f, 8f)
            horizontalLineTo(16f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(8.632f)
            curveTo(8.882f, 17.527f, 9f, 17.012f, 9f, 16.5f)
            curveToRelative(0f, -1.304f, -0.999f, -2.375f, -2.273f, -2.49f)
            curveTo(7.207f, 13.478f, 7.5f, 12.773f, 7.5f, 12f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            curveTo(4.33f, 9f, 4.163f, 9.014f, 4f, 9.041f)
            verticalLineTo(3.5f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(6.5f)
            curveTo(11f, 6.776f, 11.224f, 7f, 11.5f, 7f)
            horizontalLineToRelative(4.25f)
            lineTo(11f, 2.25f)
            close()
            moveTo(6.5f, 12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveTo(8f, 16.5f)
            curveTo(8f, 17.745f, 7f, 19f, 4.5f, 19f)
            reflectiveCurveTo(1f, 17.75f, 1f, 16.5f)
            curveTo(1f, 15.672f, 1.672f, 15f, 2.5f, 15f)
            horizontalLineToRelative(4f)
            curveTo(7.328f, 15f, 8f, 15.672f, 8f, 16.5f)
            close()
        }
    }.build()
}
