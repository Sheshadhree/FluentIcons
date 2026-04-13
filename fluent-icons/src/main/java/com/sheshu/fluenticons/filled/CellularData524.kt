package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CellularData524: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CellularData524",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 17f)
            curveToRelative(0.552f, 0f, 1f, 0.44f, 1f, 0.984f)
            verticalLineToRelative(1.032f)
            curveTo(5f, 19.56f, 4.552f, 20f, 4f, 20f)
            reflectiveCurveToRelative(-1f, -0.44f, -1f, -0.984f)
            verticalLineToRelative(-1.032f)
            curveTo(3f, 17.44f, 3.448f, 17f, 4f, 17f)
            close()
        }
    }.build()
}
