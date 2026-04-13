package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentRibbon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentRibbon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(5.126f)
            curveTo(4.32f, 9.044f, 4.655f, 9f, 5f, 9f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3.5f)
            curveTo(10f, 7.328f, 10.672f, 8f, 11.5f, 8f)
            horizontalLineTo(15f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.896f, 2f, -2f)
            verticalLineTo(7.413f)
            curveToRelative(0f, -0.398f, -0.158f, -0.78f, -0.44f, -1.06f)
            lineToRelative(-3.914f, -3.915f)
            curveTo(11.366f, 2.158f, 10.984f, 2f, 10.586f, 2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(8.793f, 5f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 7f, 11f, 6.776f, 11f, 6.5f)
            verticalLineTo(3.207f)
            lineTo(14.793f, 7f)
            close()
            moveTo(8f, 13f)
            curveToRelative(0f, 1.656f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.344f, -3f, -3f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(-1f, 3.464f)
            curveTo(6.412f, 16.804f, 5.729f, 17f, 5f, 17f)
            curveToRelative(-0.729f, 0f, -1.412f, -0.194f, -2f, -0.535f)
            verticalLineToRelative(2.286f)
            curveToRelative(0f, 0.194f, 0.211f, 0.314f, 0.378f, 0.215f)
            lineTo(5f, 17.998f)
            lineToRelative(1.622f, 0.966f)
            curveTo(6.79f, 19.064f, 7f, 18.944f, 7f, 18.75f)
            verticalLineToRelative(-2.286f)
            close()
        }
    }.build()
}
