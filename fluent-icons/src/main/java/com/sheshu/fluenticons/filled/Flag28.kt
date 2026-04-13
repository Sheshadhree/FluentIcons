package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flag28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flag28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 18f)
            horizontalLineToRelative(17.75f)
            curveToRelative(0.59f, 0f, 0.95f, -0.65f, 0.635f, -1.15f)
            lineToRelative(-3.999f, -6.35f)
            lineToRelative(3.999f, -6.35f)
            curveTo(24.199f, 3.65f, 23.84f, 3f, 23.25f, 3f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 3f, 4f, 3.336f, 4f, 3.75f)
            verticalLineToRelative(20.5f)
            curveTo(4f, 24.664f, 4.336f, 25f, 4.75f, 25f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}
