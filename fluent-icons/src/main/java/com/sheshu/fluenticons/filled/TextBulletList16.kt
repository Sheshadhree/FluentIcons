package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextBulletList16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBulletList16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.25f, 5f)
            curveTo(2.94f, 5f, 3.5f, 4.44f, 3.5f, 3.75f)
            reflectiveCurveTo(2.94f, 2.5f, 2.25f, 2.5f)
            reflectiveCurveTo(1f, 3.06f, 1f, 3.75f)
            reflectiveCurveTo(1.56f, 5f, 2.25f, 5f)
            close()
            moveToRelative(0f, 4.25f)
            curveTo(2.94f, 9.25f, 3.5f, 8.69f, 3.5f, 8f)
            reflectiveCurveTo(2.94f, 6.75f, 2.25f, 6.75f)
            reflectiveCurveTo(1f, 7.31f, 1f, 8f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
            moveToRelative(1.25f, 3f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(1f, 12.94f, 1f, 12.25f)
            reflectiveCurveTo(1.56f, 11f, 2.25f, 11f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveTo(5.75f, 3f)
            curveTo(5.336f, 3f, 5f, 3.336f, 5f, 3.75f)
            reflectiveCurveTo(5.336f, 4.5f, 5.75f, 4.5f)
            horizontalLineToRelative(8.5f)
            curveTo(14.664f, 4.5f, 15f, 4.164f, 15f, 3.75f)
            reflectiveCurveTo(14.664f, 3f, 14.25f, 3f)
            horizontalLineToRelative(-8.5f)
            close()
            moveTo(5f, 8f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(8.5f)
            curveTo(14.664f, 7.25f, 15f, 7.586f, 15f, 8f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(5.336f, 8.75f, 5f, 8.414f, 5f, 8f)
            close()
            moveToRelative(0.75f, 3.5f)
            curveTo(5.336f, 11.5f, 5f, 11.836f, 5f, 12.25f)
            reflectiveCurveTo(5.336f, 13f, 5.75f, 13f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
