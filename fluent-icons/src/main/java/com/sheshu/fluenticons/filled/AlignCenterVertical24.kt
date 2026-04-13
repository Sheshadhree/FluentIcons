package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterVertical24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.25f, 21.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(20f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-2.5f)
            curveTo(19.5f, 5.007f, 18.493f, 4f, 17.25f, 4f)
            horizontalLineToRelative(-4.5f)
            verticalLineTo(2.75f)
            curveTo(12.75f, 2.336f, 12.414f, 2f, 12f, 2f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineTo(4f)
            horizontalLineToRelative(-4.5f)
            curveTo(5.507f, 4f, 4.5f, 5.007f, 4.5f, 6.25f)
            verticalLineToRelative(2.5f)
            curveTo(4.5f, 9.993f, 5.507f, 11f, 6.75f, 11f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.243f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineToRelative(2.5f)
            curveTo(6.5f, 18.993f, 7.507f, 20f, 8.75f, 20f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(1.25f)
            close()
        }
    }.build()
}
