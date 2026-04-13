package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Cursor32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Cursor32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.999f, 3.503f)
            curveToRelative(0f, -1.253f, 1.445f, -1.954f, 2.429f, -1.178f)
            lineTo(27.424f, 17.32f)
            curveToRelative(1.117f, 0.881f, 0.494f, 2.677f, -0.93f, 2.677f)
            horizontalLineTo(16.303f)
            curveToRelative(-0.153f, 0f, -0.298f, 0.07f, -0.393f, 0.192f)
            lineTo(8.677f, 29.42f)
            curveToRelative(-0.88f, 1.123f, -2.681f, 0.5f, -2.68f, -0.925f)
            lineTo(5.998f, 3.503f)
            close()
            moveToRelative(1.81f, -0.393f)
            curveToRelative(-0.329f, -0.258f, -0.81f, -0.025f, -0.81f, 0.393f)
            lineTo(6.996f, 28.496f)
            curveToRelative(0f, 0.475f, 0.6f, 0.683f, 0.894f, 0.309f)
            lineToRelative(7.232f, -9.233f)
            curveToRelative(0.284f, -0.363f, 0.72f, -0.575f, 1.18f, -0.575f)
            horizontalLineToRelative(10.193f)
            curveToRelative(0.474f, 0f, 0.682f, -0.599f, 0.31f, -0.893f)
            lineTo(7.808f, 3.11f)
            close()
        }
    }.build()
}
