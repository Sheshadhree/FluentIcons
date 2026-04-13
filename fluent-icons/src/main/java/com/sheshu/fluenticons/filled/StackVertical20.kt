package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StackVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StackVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(10.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(13.5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(2.75f)
            curveTo(4.5f, 16.664f, 4.164f, 17f, 3.75f, 17f)
            reflectiveCurveTo(3f, 16.664f, 3f, 16.25f)
            verticalLineTo(5.5f)
            close()
            moveToRelative(1.5f, 5.708f)
            curveTo(4.806f, 11.074f, 5.144f, 11f, 5.5f, 11f)
            horizontalLineToRelative(9f)
            curveToRelative(0.356f, 0f, 0.694f, 0.074f, 1f, 0.208f)
            verticalLineTo(9.5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(1.708f)
            close()
            moveToRelative(11f, -5.708f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(1.708f)
            curveTo(4.806f, 7.074f, 5.144f, 7f, 5.5f, 7f)
            horizontalLineToRelative(9f)
            curveToRelative(0.356f, 0f, 0.694f, 0.074f, 1f, 0.208f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}
