package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CellularData520: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CellularData520",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 12f)
            curveToRelative(0.377f, 0f, 0.689f, 0.278f, 0.743f, 0.64f)
            lineTo(5.5f, 12.75f)
            verticalLineToRelative(2.503f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.377f, 0f, -0.69f, -0.277f, -0.743f, -0.64f)
            lineTo(4f, 15.254f)
            verticalLineTo(12.75f)
            curveTo(4f, 12.336f, 4.336f, 12f, 4.75f, 12f)
            close()
        }
    }.build()
}
