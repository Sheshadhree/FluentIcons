package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Seat24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Seat24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(5.627f)
            curveTo(20.315f, 11.328f, 19.446f, 11f, 18.5f, 11f)
            curveToRelative(-1.339f, 0f, -2.524f, 0.658f, -3.25f, 1.668f)
            curveTo(14.524f, 11.658f, 13.339f, 11f, 12f, 11f)
            reflectiveCurveToRelative(-2.524f, 0.658f, -3.25f, 1.668f)
            curveTo(8.024f, 11.658f, 6.839f, 11f, 5.5f, 11f)
            curveToRelative(-0.946f, 0f, -1.815f, 0.328f, -2.5f, 0.877f)
            verticalLineTo(6.25f)
            close()
            moveTo(14.5f, 15f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveTo(9.5f, 13.62f, 9.5f, 15f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(1.5f, 6f)
            horizontalLineToRelative(2.75f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(15f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveTo(16f, 13.62f, 16f, 15f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(-8f, 0f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
            verticalLineTo(15f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveTo(8f, 13.62f, 8f, 15f)
            verticalLineToRelative(6f)
            close()
        }
    }.build()
}
