package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tablet32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tablet32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 21f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(5.25f, 5f)
            curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
            verticalLineToRelative(15.5f)
            curveTo(2f, 25.545f, 3.455f, 27f, 5.25f, 27f)
            horizontalLineToRelative(21.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(8.25f)
            curveTo(30f, 6.455f, 28.545f, 5f, 26.75f, 5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(4f, 8.25f)
            curveTo(4f, 7.56f, 4.56f, 7f, 5.25f, 7f)
            horizontalLineToRelative(21.5f)
            curveTo(27.44f, 7f, 28f, 7.56f, 28f, 8.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 25f, 4f, 24.44f, 4f, 23.75f)
            verticalLineTo(8.25f)
            close()
        }
    }.build()
}
