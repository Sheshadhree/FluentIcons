package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ContactCard32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ContactCard32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 13f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.447f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(1f, 4f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.553f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.447f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(-6f, -4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(-6f, 4.5f)
            curveTo(7f, 16.672f, 7.672f, 16f, 8.5f, 16f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            curveToRelative(0f, 0f, 0f, 3.5f, -4f, 3.5f)
            reflectiveCurveToRelative(-4f, -3.5f, -4f, -3.5f)
            close()
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
            horizontalLineToRelative(21.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(7.25f)
            curveTo(28f, 6.56f, 27.44f, 6f, 26.75f, 6f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}
