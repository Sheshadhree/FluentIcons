package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ReOrderVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 21f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            curveToRelative(0.513f, 0f, 0.935f, 0.386f, 0.993f, 0.883f)
            lineTo(15f, 3f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.883f)
            lineTo(13f, 21f)
            close()
            moveToRelative(-4f, 0f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            curveToRelative(0.513f, 0f, 0.935f, 0.386f, 0.993f, 0.883f)
            lineTo(11f, 3f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.883f)
            lineTo(9f, 21f)
            close()
        }
    }.build()
}
