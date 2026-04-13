package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ContactCard32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContactCard32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineToRelative(17.5f)
            curveTo(2f, 26.545f, 3.455f, 28f, 5.25f, 28f)
            horizontalLineToRelative(21.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(7.25f)
            curveTo(30f, 5.455f, 28.545f, 4f, 26.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(18f, 13f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.447f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(1f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(0.553f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.447f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
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
        }
    }.build()
}
