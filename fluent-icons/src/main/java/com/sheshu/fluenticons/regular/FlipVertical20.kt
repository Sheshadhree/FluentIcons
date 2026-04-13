package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.77f, 2.079f)
            curveTo(15.913f, 2.17f, 16f, 2.329f, 16f, 2.5f)
            verticalLineToRelative(6f)
            curveTo(16f, 8.776f, 15.776f, 9f, 15.5f, 9f)
            horizontalLineToRelative(-13f)
            curveTo(2.265f, 9f, 2.062f, 8.837f, 2.012f, 8.607f)
            curveToRelative(-0.05f, -0.23f, 0.065f, -0.463f, 0.279f, -0.561f)
            lineToRelative(13f, -6f)
            curveToRelative(0.154f, -0.071f, 0.335f, -0.06f, 0.479f, 0.033f)
            close()
            moveTo(4.777f, 8f)
            horizontalLineTo(15f)
            verticalLineTo(3.281f)
            lineTo(4.777f, 8f)
            close()
            moveTo(16f, 17.5f)
            curveToRelative(0f, 0.17f, -0.087f, 0.33f, -0.23f, 0.421f)
            curveToRelative(-0.144f, 0.092f, -0.325f, 0.104f, -0.48f, 0.033f)
            lineToRelative(-13f, -6f)
            curveToRelative(-0.213f, -0.098f, -0.329f, -0.332f, -0.278f, -0.561f)
            curveTo(2.062f, 11.163f, 2.265f, 11f, 2.5f, 11f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(6f)
            close()
        }
    }.build()
}
