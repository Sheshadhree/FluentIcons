package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bot16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bot16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(2f)
            curveTo(11.328f, 2f, 12f, 2.672f, 12f, 3.5f)
            verticalLineToRelative(3f)
            curveTo(12f, 7.328f, 11.328f, 8f, 10.5f, 8f)
            horizontalLineToRelative(-5f)
            curveTo(4.672f, 8f, 4f, 7.328f, 4f, 6.5f)
            verticalLineToRelative(-3f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineToRelative(2f)
            verticalLineTo(1.5f)
            curveTo(7.5f, 1.224f, 7.724f, 1f, 8f, 1f)
            close()
            moveTo(4.5f, 9.5f)
            curveTo(3.672f, 9.5f, 3f, 10.172f, 3f, 11f)
            verticalLineToRelative(0.35f)
            curveToRelative(0f, 1.305f, 0.6f, 2.25f, 1.554f, 2.843f)
            curveTo(5.479f, 14.768f, 6.71f, 15f, 8f, 15f)
            curveToRelative(1.297f, 0f, 2.528f, -0.231f, 3.452f, -0.807f)
            curveTo(12.406f, 13.6f, 13f, 12.653f, 13f, 11.35f)
            verticalLineTo(11f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(2f, -3.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(6.914f, 4.25f, 6.5f, 4.25f)
            reflectiveCurveTo(5.75f, 4.586f, 5.75f, 5f)
            reflectiveCurveTo(6.086f, 5.75f, 6.5f, 5.75f)
            close()
            moveTo(10.25f, 5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(8.75f, 4.586f, 8.75f, 5f)
            reflectiveCurveTo(9.086f, 5.75f, 9.5f, 5.75f)
            reflectiveCurveTo(10.25f, 5.414f, 10.25f, 5f)
            close()
        }
    }.build()
}
