package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRight28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.705f, 4.289f)
            curveTo(15.312f, 3.9f, 14.679f, 3.904f, 14.29f, 4.297f)
            reflectiveCurveToRelative(-0.385f, 1.026f, 0.008f, 1.414f)
            lineTo(21.675f, 13f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(17.673f)
            lineToRelative(-7.374f, 7.286f)
            curveToRelative(-0.393f, 0.389f, -0.396f, 1.022f, -0.008f, 1.415f)
            curveToRelative(0.388f, 0.392f, 1.021f, 0.396f, 1.414f, 0.008f)
            lineToRelative(8.927f, -8.821f)
            curveToRelative(0.495f, -0.49f, 0.495f, -1.289f, 0f, -1.778f)
            lineToRelative(-8.927f, -8.821f)
            close()
        }
    }.build()
}
