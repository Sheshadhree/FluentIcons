package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ContactCard20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContactCard20",
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
            moveToRelative(3f, 6f)
            curveTo(5.672f, 10f, 5f, 9.328f, 5f, 8.5f)
            reflectiveCurveTo(5.672f, 7f, 6.5f, 7f)
            reflectiveCurveTo(8f, 7.672f, 8f, 8.5f)
            reflectiveCurveTo(7.328f, 10f, 6.5f, 10f)
            close()
            moveToRelative(-1.551f, 0.75f)
            horizontalLineTo(8.05f)
            curveToRelative(0.525f, 0f, 0.95f, 0.425f, 0.95f, 0.949f)
            curveToRelative(0f, 0.847f, -0.577f, 1.585f, -1.399f, 1.791f)
            lineToRelative(-0.059f, 0.015f)
            curveToRelative(-0.684f, 0.17f, -1.4f, 0.17f, -2.084f, 0f)
            lineToRelative(-0.06f, -0.015f)
            curveTo(4.578f, 13.284f, 4f, 12.546f, 4f, 11.699f)
            curveToRelative(0f, -0.524f, 0.425f, -0.949f, 0.949f, -0.949f)
            close()
            moveTo(11f, 8.5f)
            curveTo(11f, 8.224f, 11.224f, 8f, 11.5f, 8f)
            horizontalLineToRelative(3f)
            curveTo(14.776f, 8f, 15f, 8.224f, 15f, 8.5f)
            reflectiveCurveTo(14.776f, 9f, 14.5f, 9f)
            horizontalLineToRelative(-3f)
            curveTo(11.224f, 9f, 11f, 8.776f, 11f, 8.5f)
            close()
            moveToRelative(0.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 12f, 14.5f, 12f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
