package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Subtract12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Subtract12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(6.5f)
            curveTo(9.664f, 5.25f, 10f, 5.586f, 10f, 6f)
            reflectiveCurveTo(9.664f, 6.75f, 9.25f, 6.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(2.336f, 6.75f, 2f, 6.414f, 2f, 6f)
            close()
        }
    }.build()
}
