package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Archive24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Archive24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 11f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(14.164f, 11f, 13.75f, 11f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(3f, 5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineToRelative(13.5f)
            curveTo(19.993f, 3f, 21f, 4.007f, 21f, 5.25f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.78f, -0.397f, 1.467f, -1f, 1.871f)
            verticalLineToRelative(8.629f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(5.679f, 21f, 4f, 19.321f, 4f, 17.25f)
            verticalLineTo(8.621f)
            curveTo(3.397f, 8.217f, 3f, 7.531f, 3f, 6.75f)
            verticalLineToRelative(-1.5f)
            close()
            moveTo(5.5f, 9f)
            verticalLineToRelative(8.25f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(9f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(5.25f, 4.5f)
            curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}
