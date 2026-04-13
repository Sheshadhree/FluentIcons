package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownloadOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownloadOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 20.914f)
            lineToRelative(8.793f, 8.793f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-26f, -26f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineTo(15f, 16.414f)
            verticalLineToRelative(4.172f)
            lineToRelative(-5.293f, -5.293f)
            curveToRelative(-0.39f, -0.39f, -1.023f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(7f, 7f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(2.793f, -2.793f)
            close()
            moveTo(18.086f, 19.5f)
            lineTo(17f, 20.586f)
            verticalLineToRelative(-2.171f)
            lineToRelative(1.086f, 1.085f)
            close()
            moveToRelative(3.889f, -1.06f)
            lineToRelative(-1.415f, -1.414f)
            lineToRelative(1.733f, -1.733f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-1.732f, 1.733f)
            close()
            moveTo(15f, 4f)
            verticalLineToRelative(7.466f)
            lineToRelative(2f, 2f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.447f, -1f, -1f, -1f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
            moveTo(7f, 27f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(18f)
            curveToRelative(0.553f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.447f, -1f, -1f, -1f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
