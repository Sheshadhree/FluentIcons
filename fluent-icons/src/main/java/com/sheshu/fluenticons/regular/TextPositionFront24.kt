package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPositionFront24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPositionFront24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 4f)
            curveTo(3.336f, 4f, 3f, 4.336f, 3f, 4.75f)
            reflectiveCurveTo(3.336f, 5.5f, 3.75f, 5.5f)
            horizontalLineToRelative(16.5f)
            curveTo(20.664f, 5.5f, 21f, 5.164f, 21f, 4.75f)
            reflectiveCurveTo(20.664f, 4f, 20.25f, 4f)
            horizontalLineTo(3.75f)
            close()
            moveTo(12f, 8.5f)
            curveToRelative(-1.025f, 0f, -1.906f, 0.617f, -2.292f, 1.5f)
            horizontalLineTo(8.126f)
            curveTo(8.57f, 8.275f, 10.136f, 7f, 12f, 7f)
            curveToRelative(1.864f, 0f, 3.43f, 1.275f, 3.874f, 3f)
            horizontalLineToRelative(-1.582f)
            curveTo(13.906f, 9.117f, 13.025f, 8.5f, 12f, 8.5f)
            close()
            moveToRelative(-4f, 5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(8f, 16.164f, 8f, 15.75f)
            verticalLineTo(13.5f)
            close()
            moveToRelative(8f, 0f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(16f, 16.164f, 16f, 15.75f)
            verticalLineTo(13.5f)
            close()
            moveToRelative(4.25f, -2.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 12.5f, 3f, 12.164f, 3f, 11.75f)
            reflectiveCurveTo(3.336f, 11f, 3.75f, 11f)
            horizontalLineToRelative(16.5f)
            close()
            moveTo(3f, 18.75f)
            curveTo(3f, 18.336f, 3.336f, 18f, 3.75f, 18f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 19.5f, 3f, 19.164f, 3f, 18.75f)
            close()
        }
    }.build()
}
