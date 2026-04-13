package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Filter16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Filter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.75f, 3.75f)
            curveTo(1.75f, 3.336f, 2.086f, 3f, 2.5f, 3f)
            horizontalLineToRelative(11f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(13.914f, 4.5f, 13.5f, 4.5f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(2f, 4f)
            curveTo(3.75f, 7.336f, 4.086f, 7f, 4.5f, 7f)
            horizontalLineToRelative(7f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(11.914f, 8.5f, 11.5f, 8.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(2f, 4f)
            curveTo(5.75f, 11.336f, 6.086f, 11f, 6.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(9.914f, 12.5f, 9.5f, 12.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
