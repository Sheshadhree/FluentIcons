package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Payment48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Payment48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 9f)
            curveTo(6.798f, 9f, 4f, 11.798f, 4f, 15.25f)
            verticalLineToRelative(3.25f)
            horizontalLineToRelative(40f)
            verticalLineToRelative(-3.25f)
            curveTo(44f, 11.798f, 41.202f, 9f, 37.75f, 9f)
            horizontalLineToRelative(-27.5f)
            close()
            moveTo(4f, 32.75f)
            verticalLineTo(21f)
            horizontalLineToRelative(40f)
            verticalLineToRelative(11.75f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-27.5f)
            curveTo(6.798f, 39f, 4f, 36.202f, 4f, 32.75f)
            close()
            moveToRelative(27.25f, -3.25f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(30.56f, 32f, 31.25f, 32f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-5.5f)
            close()
        }
    }.build()
}
