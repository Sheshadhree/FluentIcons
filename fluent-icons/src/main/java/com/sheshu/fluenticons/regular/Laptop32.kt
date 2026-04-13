package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Laptop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Laptop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 6f)
            curveTo(5.455f, 6f, 4f, 7.455f, 4f, 9.25f)
            verticalLineToRelative(9.5f)
            curveTo(4f, 20.545f, 5.455f, 22f, 7.25f, 22f)
            horizontalLineToRelative(17.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-9.5f)
            curveTo(28f, 7.455f, 26.545f, 6f, 24.75f, 6f)
            horizontalLineTo(7.25f)
            close()
            moveTo(6f, 9.25f)
            curveTo(6f, 8.56f, 6.56f, 8f, 7.25f, 8f)
            horizontalLineToRelative(17.5f)
            curveTo(25.44f, 8f, 26f, 8.56f, 26f, 9.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(7.25f)
            curveTo(6.56f, 20f, 6f, 19.44f, 6f, 18.75f)
            verticalLineToRelative(-9.5f)
            close()
            moveTo(3f, 24f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(26f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
