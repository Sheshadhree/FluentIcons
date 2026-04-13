package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Resize24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Resize24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 3f)
            horizontalLineToRelative(-4f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(2f)
            curveTo(3f, 8.664f, 3.336f, 9f, 3.75f, 9f)
            reflectiveCurveTo(4.5f, 8.664f, 4.5f, 8.25f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(4f)
            curveTo(10.664f, 4.5f, 11f, 4.164f, 11f, 3.75f)
            reflectiveCurveTo(10.664f, 3f, 10.25f, 3f)
            close()
            moveToRelative(0.5f, 18f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-4.5f)
            curveTo(4.455f, 10f, 3f, 11.455f, 3f, 13.25f)
            verticalLineToRelative(4.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(4.5f)
            close()
            moveToRelative(5f, 0f)
            curveTo(15.336f, 21f, 15f, 20.664f, 15f, 20.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(2f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(21f, 13.336f, 21f, 13.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(21f, 10.25f)
            verticalLineToRelative(-4f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineToRelative(-4f)
            curveTo(13.336f, 3f, 13f, 3.336f, 13f, 3.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(4f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(21f, 10.664f, 21f, 10.25f)
            close()
        }
    }.build()
}
