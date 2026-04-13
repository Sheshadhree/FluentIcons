package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Phone32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Phone32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 24f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(18.776f, 24f, 18.5f, 24f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(10.25f, 2f)
            curveTo(8.455f, 2f, 7f, 3.455f, 7f, 5.25f)
            verticalLineToRelative(21.5f)
            curveTo(7f, 28.545f, 8.455f, 30f, 10.25f, 30f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(5.25f)
            curveTo(25f, 3.455f, 23.545f, 2f, 21.75f, 2f)
            horizontalLineToRelative(-11.5f)
            close()
            moveTo(8f, 5.25f)
            curveTo(8f, 4.007f, 9.007f, 3f, 10.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(22.993f, 3f, 24f, 4.007f, 24f, 5.25f)
            verticalLineToRelative(21.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-11.5f)
            curveTo(9.007f, 29f, 8f, 27.993f, 8f, 26.75f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}
