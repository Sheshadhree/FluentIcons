package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Database20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Database20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 8f)
            curveToRelative(3.314f, 0f, 6f, -1.343f, 6f, -3f)
            reflectiveCurveToRelative(-2.686f, -3f, -6f, -3f)
            reflectiveCurveToRelative(-6f, 1.343f, -6f, 3f)
            reflectiveCurveToRelative(2.686f, 3f, 6f, 3f)
            close()
            moveToRelative(4.69f, 0.016f)
            curveTo(15.16f, 7.78f, 15.617f, 7.482f, 16f, 7.12f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.657f, -2.686f, 3f, -6f, 3f)
            reflectiveCurveToRelative(-6f, -1.343f, -6f, -3f)
            verticalLineTo(7.12f)
            curveToRelative(0.383f, 0.362f, 0.84f, 0.661f, 1.31f, 0.896f)
            curveTo(6.562f, 8.642f, 8.222f, 9f, 10f, 9f)
            curveToRelative(1.778f, 0f, 3.438f, -0.358f, 4.69f, -0.984f)
            close()
        }
    }.build()
}
