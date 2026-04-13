package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowsBidirectional20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowsBidirectional20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.678f, 5.033f)
            curveTo(6.872f, 5.106f, 7f, 5.293f, 7f, 5.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(6f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -0.208f, 0.128f, -0.394f, 0.322f, -0.467f)
            curveToRelative(0.194f, -0.074f, 0.414f, -0.02f, 0.552f, 0.135f)
            lineToRelative(4f, 4.5f)
            curveToRelative(0.168f, 0.19f, 0.168f, 0.475f, 0f, 0.664f)
            lineToRelative(-4f, 4.5f)
            curveToRelative(-0.138f, 0.155f, -0.358f, 0.21f, -0.552f, 0.135f)
            curveTo(13.128f, 14.894f, 13f, 14.707f, 13f, 14.5f)
            verticalLineTo(12f)
            horizontalLineTo(7f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.208f, -0.128f, 0.394f, -0.322f, 0.467f)
            curveToRelative(-0.194f, 0.074f, -0.414f, 0.02f, -0.552f, -0.135f)
            lineToRelative(-4f, -4.5f)
            curveToRelative(-0.168f, -0.19f, -0.168f, -0.475f, 0f, -0.664f)
            lineToRelative(4f, -4.5f)
            curveToRelative(0.138f, -0.155f, 0.358f, -0.21f, 0.552f, -0.135f)
            close()
        }
    }.build()
}
