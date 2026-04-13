package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSquareUpRight24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSquareUpRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(8.75f, 9.5f)
            horizontalLineToRelative(4.74f)
            lineToRelative(-5.268f, 5.217f)
            curveToRelative(-0.294f, 0.292f, -0.296f, 0.766f, -0.005f, 1.06f)
            curveToRelative(0.292f, 0.295f, 0.766f, 0.297f, 1.06f, 0.006f)
            lineToRelative(5.223f, -5.172f)
            verticalLineToRelative(4.639f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(16f, 15.664f, 16f, 15.25f)
            verticalLineToRelative(-6.5f)
            curveTo(16f, 8.336f, 15.664f, 8f, 15.25f, 8f)
            horizontalLineToRelative(-6.5f)
            curveTo(8.336f, 8f, 8f, 8.336f, 8f, 8.75f)
            reflectiveCurveTo(8.336f, 9.5f, 8.75f, 9.5f)
            close()
        }
    }.build()
}
