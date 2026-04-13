package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.75f, 3f)
            curveTo(10.337f, 3f, 10f, 3.336f, 10f, 3.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(7.67f)
            lineTo(3.22f, 19.7f)
            curveToRelative(-0.299f, 0.298f, -0.299f, 0.782f, 0f, 1.081f)
            curveToRelative(0.299f, 0.299f, 0.783f, 0.299f, 1.081f, 0f)
            lineToRelative(15.2f, -15.2f)
            verticalLineToRelative(7.669f)
            curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-9.5f)
            curveTo(21f, 3.336f, 20.665f, 3f, 20.25f, 3f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
