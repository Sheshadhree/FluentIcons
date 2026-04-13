package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clover28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clover28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 2f)
            curveTo(4.574f, 2f, 2f, 4.574f, 2f, 7.75f)
            reflectiveCurveToRelative(2.574f, 5.75f, 5.75f, 5.75f)
            horizontalLineToRelative(5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-5f)
            curveTo(13.5f, 4.574f, 10.926f, 2f, 7.75f, 2f)
            close()
            moveToRelative(0f, 24f)
            curveTo(4.574f, 26f, 2f, 23.426f, 2f, 20.25f)
            reflectiveCurveToRelative(2.574f, -5.75f, 5.75f, -5.75f)
            horizontalLineToRelative(5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.176f, -2.574f, 5.75f, -5.75f, 5.75f)
            close()
            moveToRelative(12.5f, -24f)
            curveTo(23.426f, 2f, 26f, 4.574f, 26f, 7.75f)
            reflectiveCurveToRelative(-2.574f, 5.75f, -5.75f, 5.75f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-5f)
            curveTo(14.5f, 4.574f, 17.074f, 2f, 20.25f, 2f)
            close()
            moveToRelative(0f, 24f)
            curveToRelative(3.176f, 0f, 5.75f, -2.574f, 5.75f, -5.75f)
            reflectiveCurveToRelative(-2.574f, -5.75f, -5.75f, -5.75f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.176f, 2.574f, 5.75f, 5.75f, 5.75f)
            close()
        }
    }.build()
}
