package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareScreenPersonOverlayInside24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenPersonOverlayInside24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineToRelative(13.5f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineToRelative(-9.5f)
            close()
            moveTo(16f, 12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveTo(5f, 8f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            curveTo(5.448f, 7f, 5f, 7.448f, 5f, 8f)
            close()
            moveToRelative(9f, 5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(0.25f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(0.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(14f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
