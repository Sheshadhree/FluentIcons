package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Compose20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Compose20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 4f)
            curveTo(10.664f, 4f, 11f, 4.336f, 11f, 4.75f)
            reflectiveCurveTo(10.664f, 5.5f, 10.25f, 5.5f)
            horizontalLineToRelative(-4f)
            curveTo(5.284f, 5.5f, 4.5f, 6.284f, 4.5f, 7.25f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-4f)
            curveTo(14.5f, 9.336f, 14.836f, 9f, 15.25f, 9f)
            reflectiveCurveTo(16f, 9.336f, 16f, 9.75f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-6.5f)
            curveTo(4.455f, 17f, 3f, 15.545f, 3f, 13.75f)
            verticalLineToRelative(-6.5f)
            curveTo(3f, 5.455f, 4.455f, 4f, 6.25f, 4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(5.47f, -0.78f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-7.19f, 7.19f)
            lineTo(8f, 12f)
            lineToRelative(0.53f, -1.59f)
            lineToRelative(7.19f, -7.19f)
            close()
        }
    }.build()
}
