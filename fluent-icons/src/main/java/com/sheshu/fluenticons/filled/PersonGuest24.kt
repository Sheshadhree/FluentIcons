package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonGuest24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonGuest24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 12f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-7.464f, 2f)
            curveTo(13.013f, 14.163f, 13f, 14.33f, 13f, 14.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.393f, 0.065f, 0.77f, 0.185f, 1.122f)
            curveToRelative(-0.956f, 0.25f, -2.018f, 0.379f, -3.185f, 0.379f)
            curveToRelative(-3.42f, 0f, -5.943f, -1.072f, -7.485f, -3.236f)
            curveToRelative(-0.332f, -0.466f, -0.511f, -1.024f, -0.511f, -1.596f)
            verticalLineToRelative(-0.92f)
            curveTo(2.004f, 15.007f, 3.01f, 14f, 4.253f, 14f)
            horizontalLineToRelative(8.783f)
            close()
            moveTo(17f, 14f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(16.724f, 15f, 17f, 15f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(20.276f, 14f, 20f, 14f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(10f, 2.005f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
        }
    }.build()
}
