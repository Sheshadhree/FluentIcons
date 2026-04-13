package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUp28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUp28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.29f, 12.296f)
            curveToRelative(-0.388f, 0.393f, -0.384f, 1.027f, 0.01f, 1.415f)
            curveToRelative(0.392f, 0.388f, 1.025f, 0.384f, 1.413f, -0.009f)
            lineToRelative(7.289f, -7.376f)
            verticalLineToRelative(17.675f)
            curveToRelative(0f, 0.553f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.447f, 1f, -1f)
            verticalLineTo(6.328f)
            lineToRelative(7.286f, 7.374f)
            curveToRelative(0.389f, 0.393f, 1.022f, 0.397f, 1.415f, 0.009f)
            curveToRelative(0.392f, -0.389f, 0.396f, -1.022f, 0.008f, -1.415f)
            lineTo(14.89f, 3.37f)
            curveToRelative(-0.49f, -0.496f, -1.289f, -0.496f, -1.778f, 0f)
            lineTo(4.29f, 12.296f)
            close()
        }
    }.build()
}
