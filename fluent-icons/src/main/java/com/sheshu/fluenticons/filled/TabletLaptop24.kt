package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabletLaptop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabletLaptop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 17.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(16.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(4.75f)
            lineToRelative(0.101f, -0.007f)
            curveTo(21.717f, 17.943f, 22f, 17.63f, 22f, 17.25f)
            close()
            moveTo(4.25f, 11f)
            curveTo(3.007f, 11f, 2f, 12.007f, 2f, 13.25f)
            verticalLineToRelative(5.5f)
            curveTo(2f, 19.993f, 3.007f, 21f, 4.25f, 21f)
            horizontalLineToRelative(9f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(7f, 17.75f)
            curveTo(7f, 17.336f, 7.336f, 17f, 7.75f, 17f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(7.336f, 18.5f, 7f, 18.164f, 7f, 17.75f)
            close()
            moveTo(16.5f, 16f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.783f, 1.75f, -1.75f)
            verticalLineToRelative(-7.5f)
            curveTo(20f, 5.784f, 19.216f, 5f, 18.25f, 5f)
            horizontalLineTo(5.75f)
            curveTo(4.784f, 5f, 4f, 5.784f, 4f, 6.75f)
            verticalLineToRelative(3.285f)
            curveTo(4.163f, 10.012f, 4.33f, 10f, 4.5f, 10f)
            horizontalLineToRelative(9f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
