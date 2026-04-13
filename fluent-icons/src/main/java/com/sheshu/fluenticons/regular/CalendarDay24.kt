package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarDay24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarDay24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
            moveToRelative(0f, 1.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            close()
            moveToRelative(-1.5f, 6.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(7.336f, 17f, 7f, 16.664f, 7f, 16.25f)
            verticalLineToRelative(-4.5f)
            curveTo(7f, 11.336f, 7.336f, 11f, 7.75f, 11f)
            horizontalLineToRelative(8.5f)
            close()
            moveToRelative(-0.75f, 1.5f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(-3f)
            close()
            moveTo(7.75f, 7.25f)
            horizontalLineToRelative(8.5f)
            curveTo(16.664f, 7.25f, 17f, 7.586f, 17f, 8f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(16.25f, 8.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(7.336f, 8.75f, 7f, 8.414f, 7f, 8f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(7.75f, 7.25f)
            horizontalLineToRelative(8.5f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
