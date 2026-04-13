package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cast20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cast20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 4f)
            curveTo(2.672f, 4f, 2f, 4.672f, 2f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 15.328f, 2.672f, 16f, 3.5f, 16f)
            horizontalLineToRelative(13f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(18f, 4.672f, 17.328f, 4f, 16.5f, 4f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(0.497f, 4f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            curveToRelative(3.316f, 0f, 6.003f, 2.688f, 6.003f, 6.003f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            curveTo(9.5f, 10.74f, 7.26f, 8.5f, 4.497f, 8.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
            moveToRelative(0.5f, 2f)
            curveTo(6.432f, 10f, 8f, 11.568f, 8f, 13.502f)
            curveToRelative(0f, 0.277f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(7f, 13.78f, 7f, 13.502f)
            curveTo(7f, 12.12f, 5.88f, 11f, 4.497f, 11f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveToRelative(0.253f, 3.999f)
            curveToRelative(-0.415f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(4.335f, 12.5f, 4.75f, 12.5f)
            curveToRelative(0.413f, 0f, 0.749f, 0.335f, 0.749f, 0.75f)
            curveToRelative(0f, 0.413f, -0.336f, 0.749f, -0.75f, 0.749f)
            close()
        }
    }.build()
}
