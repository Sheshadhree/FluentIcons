package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CellularData524: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CellularData524",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 17.75f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 19.664f, 3.336f, 20f, 3.75f, 20f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-1.5f)
            curveTo(4.5f, 17.336f, 4.164f, 17f, 3.75f, 17f)
            reflectiveCurveTo(3f, 17.336f, 3f, 17.75f)
            close()
        }
    }.build()
}
