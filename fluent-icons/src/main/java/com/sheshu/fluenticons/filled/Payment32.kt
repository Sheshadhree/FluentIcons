package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Payment32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Payment32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5f)
            curveTo(4.015f, 5f, 2f, 7.015f, 2f, 9.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(28f)
            verticalLineTo(9.5f)
            curveTo(30f, 7.015f, 27.985f, 5f, 25.5f, 5f)
            horizontalLineToRelative(-19f)
            close()
            moveTo(2f, 22.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(28f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            close()
            moveTo(21f, 19f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
