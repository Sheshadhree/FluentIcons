package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipHorizontal20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.921f, 15.77f)
            curveTo(17.83f, 15.913f, 17.671f, 16f, 17.5f, 16f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -0.235f, 0.163f, -0.438f, 0.393f, -0.488f)
            curveToRelative(0.23f, -0.05f, 0.463f, 0.065f, 0.561f, 0.279f)
            lineToRelative(6f, 13f)
            curveToRelative(0.071f, 0.154f, 0.06f, 0.335f, -0.033f, 0.479f)
            close()
            moveTo(12f, 4.777f)
            verticalLineTo(15f)
            horizontalLineToRelative(4.718f)
            lineTo(12f, 4.777f)
            close()
            moveTo(2.5f, 16f)
            curveToRelative(-0.17f, 0f, -0.33f, -0.087f, -0.421f, -0.23f)
            curveToRelative(-0.092f, -0.144f, -0.104f, -0.325f, -0.033f, -0.48f)
            lineToRelative(6f, -13f)
            curveToRelative(0.098f, -0.213f, 0.332f, -0.329f, 0.561f, -0.278f)
            curveTo(8.837f, 2.062f, 9f, 2.265f, 9f, 2.5f)
            verticalLineToRelative(13f)
            curveTo(9f, 15.776f, 8.776f, 16f, 8.5f, 16f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}
