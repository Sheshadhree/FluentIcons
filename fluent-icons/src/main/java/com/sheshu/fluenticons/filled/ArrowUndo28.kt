package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUndo28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUndo28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.251f, 5.501f)
            curveToRelative(2.002f, -2.001f, 5.246f, -2.001f, 7.248f, 0f)
            curveToRelative(2.001f, 2.002f, 2.001f, 5.247f, 0f, 7.248f)
            lineTo(8.955f, 24.293f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(11.544f, -11.544f)
            curveToRelative(2.783f, -2.782f, 2.783f, -7.294f, 0f, -10.076f)
            curveToRelative(-2.782f, -2.783f, -7.294f, -2.783f, -10.076f, 0f)
            lineToRelative(-4.5f, 4.499f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.447f, -1f, -1f, -1f)
            curveToRelative(-0.551f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.449f, 1f, 1f, 1f)
            horizontalLineToRelative(8.003f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(8.752f)
            lineToRelative(4.499f, -4.499f)
            close()
        }
    }.build()
}
