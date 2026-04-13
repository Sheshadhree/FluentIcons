package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Map16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Map16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.223f)
            lineTo(1.235f, 4.576f)
            curveTo(1.089f, 4.667f, 1f, 4.828f, 1f, 5f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.182f, 0.099f, 0.35f, 0.258f, 0.437f)
            curveToRelative(0.159f, 0.088f, 0.353f, 0.083f, 0.507f, -0.013f)
            lineTo(5f, 11.902f)
            verticalLineToRelative(-9.68f)
            close()
            moveToRelative(1f, 9.586f)
            lineToRelative(4f, 2f)
            verticalLineTo(4.191f)
            lineToRelative(-4f, -2f)
            verticalLineToRelative(9.618f)
            close()
            moveToRelative(8.765f, -0.385f)
            lineTo(11f, 13.777f)
            verticalLineToRelative(-9.68f)
            lineToRelative(3.235f, -2.021f)
            curveToRelative(0.154f, -0.096f, 0.348f, -0.101f, 0.507f, -0.013f)
            curveTo(14.902f, 2.15f, 15f, 2.318f, 15f, 2.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.172f, -0.089f, 0.333f, -0.235f, 0.424f)
            close()
        }
    }.build()
}
