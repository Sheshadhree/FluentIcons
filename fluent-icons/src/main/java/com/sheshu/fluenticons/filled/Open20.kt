package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Open20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Open20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 4.5f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(17f, 11.336f, 17f, 11.75f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(4.455f, 17f, 3f, 15.545f, 3f, 13.75f)
            verticalLineToRelative(-7.5f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(2f)
            curveTo(8.664f, 3f, 9f, 3.336f, 9f, 3.75f)
            reflectiveCurveTo(8.664f, 4.5f, 8.25f, 4.5f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(4.25f, -0.75f)
            curveTo(10.5f, 3.336f, 10.836f, 3f, 11.25f, 3f)
            horizontalLineToRelative(5f)
            curveTo(16.664f, 3f, 17f, 3.336f, 17f, 3.75f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(15.5f, 9.164f, 15.5f, 8.75f)
            verticalLineTo(5.56f)
            lineToRelative(-3.72f, 3.72f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.72f, -3.72f)
            horizontalLineToRelative(-3.19f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
