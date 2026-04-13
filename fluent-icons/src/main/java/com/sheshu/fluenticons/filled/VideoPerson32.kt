package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoPerson32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPerson32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineToRelative(21.5f)
            curveTo(28.545f, 4f, 30f, 5.455f, 30f, 7.25f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 28f, 2f, 26.545f, 2f, 24.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(5.25f, 6f)
            curveTo(4.56f, 6f, 4f, 6.56f, 4f, 7.25f)
            verticalLineToRelative(17.5f)
            curveTo(4f, 25.44f, 4.56f, 26f, 5.25f, 26f)
            horizontalLineTo(8f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineTo(26f)
            horizontalLineToRelative(2.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(7.25f)
            curveTo(28f, 6.56f, 27.44f, 6f, 26.75f, 6f)
            horizontalLineTo(5.25f)
            close()
            moveTo(16f, 18f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            close()
        }
    }.build()
}
