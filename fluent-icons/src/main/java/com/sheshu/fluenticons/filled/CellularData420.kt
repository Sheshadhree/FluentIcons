package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CellularData420: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CellularData420",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 12f)
            curveToRelative(0.377f, 0f, 0.688f, 0.277f, 0.742f, 0.64f)
            lineTo(5.5f, 12.75f)
            verticalLineToRelative(2.5f)
            curveTo(5.5f, 15.664f, 5.164f, 16f, 4.75f, 16f)
            curveToRelative(-0.377f, 0f, -0.688f, -0.277f, -0.742f, -0.64f)
            lineTo(4f, 15.25f)
            verticalLineToRelative(-2.5f)
            curveTo(4f, 12.336f, 4.336f, 12f, 4.75f, 12f)
            close()
            moveToRelative(3f, -2f)
            curveToRelative(0.377f, 0f, 0.688f, 0.277f, 0.742f, 0.64f)
            lineTo(8.5f, 10.75f)
            verticalLineToRelative(4.5f)
            curveTo(8.5f, 15.664f, 8.164f, 16f, 7.75f, 16f)
            curveToRelative(-0.377f, 0f, -0.688f, -0.277f, -0.742f, -0.64f)
            lineTo(7f, 15.25f)
            verticalLineToRelative(-4.5f)
            curveTo(7f, 10.336f, 7.336f, 10f, 7.75f, 10f)
            close()
        }
    }.build()
}
