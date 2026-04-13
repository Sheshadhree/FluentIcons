package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookContacts48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookContacts48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(33.75f, 4f)
            curveTo(37.202f, 4f, 40f, 6.798f, 40f, 10.25f)
            verticalLineToRelative(26f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(10.575f)
            curveToRelative(0.348f, 1.712f, 1.86f, 3f, 3.675f, 3f)
            horizontalLineToRelative(24.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(39.44f, 44f, 38.75f, 44f)
            horizontalLineToRelative(-24.5f)
            curveTo(10.798f, 44f, 8f, 41.202f, 8f, 37.75f)
            verticalLineToRelative(-27.5f)
            curveTo(8f, 6.798f, 10.798f, 4f, 14.25f, 4f)
            horizontalLineToRelative(19.5f)
            close()
            moveTo(19f, 22f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 2.485f, 2.5f, 5.5f, 8f, 5.5f)
            reflectiveCurveToRelative(8f, -3.015f, 8f, -5.5f)
            verticalLineTo(25f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(19f)
            close()
            moveToRelative(5f, -11.5f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.015f, -4.5f, -4.5f, -4.5f)
            close()
        }
    }.build()
}
