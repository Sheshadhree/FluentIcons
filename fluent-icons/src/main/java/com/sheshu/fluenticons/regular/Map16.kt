package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Map16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Map16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.235f, 2.076f)
            curveToRelative(0.148f, -0.092f, 0.333f, -0.101f, 0.489f, -0.023f)
            lineToRelative(4.749f, 2.374f)
            lineToRelative(3.762f, -2.351f)
            curveToRelative(0.154f, -0.096f, 0.348f, -0.101f, 0.507f, -0.013f)
            curveTo(14.902f, 2.15f, 15f, 2.318f, 15f, 2.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.172f, -0.089f, 0.333f, -0.235f, 0.424f)
            lineToRelative(-4f, 2.5f)
            curveToRelative(-0.148f, 0.092f, -0.333f, 0.101f, -0.489f, 0.023f)
            lineToRelative(-4.749f, -2.374f)
            lineToRelative(-3.762f, 2.351f)
            curveToRelative(-0.154f, 0.096f, -0.348f, 0.101f, -0.507f, 0.013f)
            curveTo(1.098f, 13.85f, 1f, 13.682f, 1f, 13.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.172f, 0.089f, -0.333f, 0.235f, -0.424f)
            lineToRelative(4f, -2.5f)
            close()
            moveTo(6f, 10.691f)
            lineToRelative(4f, 2f)
            verticalLineTo(5.309f)
            lineToRelative(-4f, -2f)
            verticalLineToRelative(7.382f)
            close()
            moveTo(5f, 3.402f)
            lineTo(2f, 5.277f)
            verticalLineToRelative(7.32f)
            lineToRelative(3f, -1.874f)
            verticalLineToRelative(-7.32f)
            close()
            moveToRelative(6f, 1.875f)
            verticalLineToRelative(7.32f)
            lineToRelative(3f, -1.874f)
            verticalLineToRelative(-7.32f)
            lineToRelative(-3f, 1.874f)
            close()
        }
    }.build()
}
