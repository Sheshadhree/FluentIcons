package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LockClosed24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LockClosed24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 15.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(8f, 6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(0.75f)
            curveTo(18.545f, 7f, 20f, 8.455f, 20f, 10.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-9.5f)
            curveTo(5.455f, 21f, 4f, 19.545f, 4f, 17.75f)
            verticalLineToRelative(-7.5f)
            curveTo(4f, 8.455f, 5.455f, 7f, 7.25f, 7f)
            horizontalLineTo(8f)
            verticalLineTo(6f)
            close()
            moveToRelative(4f, -2.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveToRelative(-4.75f, 5f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
