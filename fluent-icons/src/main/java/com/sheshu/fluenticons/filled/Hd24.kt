package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hd24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hd24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 14.5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(0.25f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(14.5f)
            close()
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
            moveToRelative(1f, 5f)
            curveTo(7.664f, 8f, 8f, 8.336f, 8f, 8.75f)
            verticalLineToRelative(2.75f)
            horizontalLineToRelative(2f)
            verticalLineTo(8.75f)
            curveTo(10f, 8.336f, 10.336f, 8f, 10.75f, 8f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(10f, 15.664f, 10f, 15.25f)
            verticalLineTo(13f)
            horizontalLineTo(8f)
            verticalLineToRelative(2.25f)
            curveTo(8f, 15.664f, 7.664f, 16f, 7.25f, 16f)
            reflectiveCurveTo(6.5f, 15.664f, 6.5f, 15.25f)
            verticalLineToRelative(-6.5f)
            curveTo(6.5f, 8.336f, 6.836f, 8f, 7.25f, 8f)
            close()
            moveToRelative(6.5f, 0f)
            horizontalLineToRelative(1f)
            curveTo(16.545f, 8f, 18f, 9.455f, 18f, 11.25f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-1f)
            curveTo(13.336f, 16f, 13f, 15.664f, 13f, 15.25f)
            verticalLineToRelative(-6.5f)
            curveTo(13f, 8.336f, 13.336f, 8f, 13.75f, 8f)
            close()
        }
    }.build()
}
